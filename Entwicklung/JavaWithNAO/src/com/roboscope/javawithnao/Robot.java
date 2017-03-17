package com.roboscope.javawithnao;

import com.aldebaran.qi.Application;
import com.aldebaran.qi.helper.proxies.*;

/**
 * This class connects to the NAO and supplies an API to extending classes.
 * Should not be used by the students directly and is therefore hidden from view.
 */
abstract class Robot {

    private static final String defaultProtocol = "tcp://";
    private static final String defaultPort = ":9559";
    private static final String unknownName = "Unknown";
    private static final long maxTimeFaceRecognition = 5000L;
    private String connectionUrl;
    private Application application = null;
    private ALTextToSpeech textToSpeech = null;
    private ALFaceDetection faceDetection = null;
    private ALRobotPosture robotPosture = null;
    private ALMotion motion = null;
    private ALLeds leds = null;
    private ALMemory memory = null;
    private String name;
    private boolean isStanding = true;

    public Robot(String robotName, String protocol, String port) {
        this.name = robotName;
        this.connectionUrl = protocol + robotName + ".local" + port;
        this.application = new Application(new String[]{}, this.connectionUrl);
        this.application.start();
        try {
            this.textToSpeech = new ALTextToSpeech(application.session());
        } catch (Exception ignored) {
        }
        try {
            this.faceDetection = new ALFaceDetection(application.session());
            this.faceDetection.setActiveCamera(0);
        } catch (Exception ignored) {
        }
        try {
            this.robotPosture = new ALRobotPosture(application.session());
        } catch (Exception ignored) {
        }
        try {
            this.motion = new ALMotion(application.session());
        } catch (Exception ignored) {
        }
        try {
            this.leds = new ALLeds(application.session());
        } catch (Exception ignored) {
        }
        try {
            this.memory = new ALMemory(application.session());
        } catch (Exception ignored) {
        }
        this.subscribeToMemoryEvents();
        this.sitDown();
    }

    private void subscribeToMemoryEvents() {
        try {
            this.memory.subscribeToEvent("FaceDetection/FaceDetected", Robot.this::faceDetected);
            this.memory.subscribeToEvent("FrontTactilTouched", Robot.this::frontHeadTactileTouched);
            this.memory.subscribeToEvent("MiddleTactilTouched", Robot.this::middleHeadTactileTouched);
            this.memory.subscribeToEvent("RearTactilTouched", Robot.this::rearHeadTactileTouched);
            this.memory.subscribeToEvent("HandLeftLeftTouched", Robot.this::leftHandTouched);
            this.memory.subscribeToEvent("HandLeftBackTouched", Robot.this::leftHandTouched);
            this.memory.subscribeToEvent("HandLeftRightTouched", Robot.this::leftHandTouched);
            this.memory.subscribeToEvent("HandRightLeftTouched", Robot.this::rightHandTouched);
            this.memory.subscribeToEvent("HandRightBackTouched", Robot.this::rightHandTouched);
            this.memory.subscribeToEvent("HandRightRightTouched", Robot.this::rightHandTouched);
            this.memory.subscribeToEvent("LeftBumperPressed", Robot.this::leftFootTouched);
            this.memory.subscribeToEvent("RightBumperPressed", Robot.this::rightFootTouched);
        } catch (Exception ignored) {
        }
    }

    /******************************************************************************************************************\
    |                                                      API                                                         |
    \******************************************************************************************************************/

    public Robot(String robotName) {
        this(robotName, defaultProtocol, defaultPort);
    }

    public String getName() {
        return this.name;
    }

    public void standUp() {
        if (this.robotPosture != null && !this.isStanding) {
            try {
                this.robotPosture.goToPosture(RobotPosture.STAND.getPostureName(),0.8f);
                this.isStanding = true;
            } catch (Exception ignored) {
            }
        }
    }

    public void sitDown() {
        if (this.robotPosture != null && this.motion != null && this.isStanding) {
            try {
                this.robotPosture.goToPosture(RobotPosture.SIT.getPostureName(),0.8f);
                this.isStanding = false;
                this.motion.stiffnessInterpolation("Body", 0, 0.1f);
            } catch (Exception ignored) {
            }
        }
    }

    public void moveForward() {
        if (this.motion != null) {
            try {
                this.standUp();
                this.motion.moveTo(0.1f, 0f, 0f);
            } catch (Exception ignored) {
            }
        }
    }

    public void moveBackward() {
        if (this.motion != null) {
            try {
                this.standUp();
                this.motion.moveTo(-0.1f, 0f, 0f);
            } catch (Exception ignored) {
            }
        }
    }

    public void moveRight() {
        if (this.motion != null) {
            try {
                this.standUp();
                this.motion.moveTo(0f, -0.1f, 0f);
            } catch (Exception ignored) {
            }
        }
    }

    public void turnRight() {
        if (this.motion != null) {
            try {
                this.standUp();
                this.motion.moveTo(0f, 0f, (float) (-90f * Math.PI / 180f));
            } catch (Exception ignored) {
            }
        }
    }

    public void moveLeft() {
        if (this.motion != null) {
            try {
                this.standUp();
                this.motion.moveTo(0f, 0.1f, 0f);
            } catch (Exception ignored) {
            }
        }
    }

    public void turnLeft() {
        if (this.motion != null) {
            try {
                this.standUp();
                this.motion.moveTo(0f, 0f, (float) (90f * Math.PI / 180f));
            } catch (Exception ignored) {
            }
        }
    }

    public void say(String sentence) {
        if (this.textToSpeech != null) {
            try {
                this.textToSpeech.say(sentence);
            } catch (Exception ignored) {
            }
        }
    }

    public Human rememberFace(String humanName) {
        if (this.faceDetection != null && this.leds != null) {
            try {
                long timestampBegin = System.currentTimeMillis();
                boolean faceRecognitionSuccessful = true;
                this.leds.fadeRGB("FaceLeds",0f, 0.6666667f, 1f,0.01f);
                while(!this.faceDetection.learnFace(humanName)) {
                    if (System.currentTimeMillis()-maxTimeFaceRecognition >= timestampBegin) {
                        faceRecognitionSuccessful = false;
                        break;
                    }
                }
                if (faceRecognitionSuccessful) {
                    this.leds.fadeRGB("FaceLeds",0f, 1f, 0f,0.01f);
                    return new Human(humanName);
                }
                this.leds.fadeRGB("FaceLeds",1f, 0f, 0f,0.01f);
            } catch (Exception ignored) {
            }
        }
        return new Human(unknownName);
    }

    /******************************************************************************************************************\
    |                                                   MEMORY EVENTS                                                  |
    \******************************************************************************************************************/

    private void faceDetected(Object arg0) {
        System.out.println("Face detected!");
        System.out.println(arg0.toString());
        this.onFaceDetected(new Human(unknownName));
    }

    public abstract void onFaceDetected(Human human);

    private void frontHeadTactileTouched(Object arg0) {
        if ((Float) arg0 > 0) {
            this.onFrontTactileTouched();
        }
    }

    public abstract void onFrontTactileTouched();

    private void middleHeadTactileTouched(Object arg0) {
        if ((Float) arg0 > 0) {
            this.onMiddleTactileTouched();
        }
    }

    public abstract void onMiddleTactileTouched();

    private void rearHeadTactileTouched(Object arg0) {
        if ((Float) arg0 > 0) {
            this.onRearTactileTouched();
        }
    }

    public abstract void onRearTactileTouched();

    private void leftHandTouched(Object arg0) {
        if ((Float) arg0 > 0) {
            this.onLeftHandTouched();
        }
    }

    public abstract void onLeftHandTouched();

    private void rightHandTouched(Object arg0) {
        if ((Float) arg0 > 0) {
            this.onRightHandTouched();
        }
    }

    public abstract void onRightHandTouched();

    private void leftFootTouched(Object arg0) {
        if ((Float) arg0 > 0) {
            this.onLeftFootTouched();
        }
    }

    public abstract void onLeftFootTouched();

    private void rightFootTouched(Object arg0) {
        if ((Float) arg0 > 0) {
            this.onRightFootTouched();
        }
    }

    public abstract void onRightFootTouched();
}
