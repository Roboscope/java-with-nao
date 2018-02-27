package com.roboscope.javawithnao;

/**
 * Benutzbar für einfache Anwendungen ohne Callbacks.
 * Kann zu jedem der NAOs in einer von extern simplen Weise verbinden.
 */
public class SimpleInterface {

    private NaoDrogon naoDrogon = null;
    private NaoViserion naoViserion = null;
    private NaoRhaegal naoRhaegal = null;
    private NaoBalerion naoBalerion = null;
    private NaoMeraxes naoMeraxes = null;

    public SimpleInterface() {
    }

    public NaoDrogon connectToDrogon() {
        this.naoDrogon = new NaoDrogon() {
            @Override
            public void onFaceDetected(Human human) {

            }

            @Override
            public void onFrontTactileTouched() {

            }

            @Override
            public void onMiddleTactileTouched() {

            }

            @Override
            public void onRearTactileTouched() {

            }

            @Override
            public void onLeftHandTouched() {

            }

            @Override
            public void onRightHandTouched() {

            }

            @Override
            public void onLeftFootTouched() {

            }

            @Override
            public void onRightFootTouched() {

            }
        };
        return this.naoDrogon;
    }

    public NaoViserion connectToViserion() {
        this.naoViserion = new NaoViserion() {
            @Override
            public void onFaceDetected(Human human) {

            }

            @Override
            public void onFrontTactileTouched() {

            }

            @Override
            public void onMiddleTactileTouched() {

            }

            @Override
            public void onRearTactileTouched() {

            }

            @Override
            public void onLeftHandTouched() {

            }

            @Override
            public void onRightHandTouched() {

            }

            @Override
            public void onLeftFootTouched() {

            }

            @Override
            public void onRightFootTouched() {

            }
        };
        return this.naoViserion;
    }

    public NaoRhaegal connectToRhaegal() {
        this.naoRhaegal = new NaoRhaegal() {
            @Override
            public void onFaceDetected(Human human) {

            }

            @Override
            public void onFrontTactileTouched() {

            }

            @Override
            public void onMiddleTactileTouched() {

            }

            @Override
            public void onRearTactileTouched() {

            }

            @Override
            public void onLeftHandTouched() {

            }

            @Override
            public void onRightHandTouched() {

            }

            @Override
            public void onLeftFootTouched() {

            }

            @Override
            public void onRightFootTouched() {

            }
        };
        return this.naoRhaegal;
    }

    public NaoBalerion connectToBalerion() {
        this.naoBalerion = new NaoBalerion() {
            @Override
            public void onFaceDetected(Human human) {

            }

            @Override
            public void onFrontTactileTouched() {

            }

            @Override
            public void onMiddleTactileTouched() {

            }

            @Override
            public void onRearTactileTouched() {

            }

            @Override
            public void onLeftHandTouched() {

            }

            @Override
            public void onRightHandTouched() {

            }

            @Override
            public void onLeftFootTouched() {

            }

            @Override
            public void onRightFootTouched() {

            }
        };
        return this.naoBalerion;
    }

    public NaoMeraxes connectToMeraxes() {
        this.naoMeraxes = new NaoMeraxes() {
            @Override
            public void onFaceDetected(Human human) {

            }

            @Override
            public void onFrontTactileTouched() {

            }

            @Override
            public void onMiddleTactileTouched() {

            }

            @Override
            public void onRearTactileTouched() {

            }

            @Override
            public void onLeftHandTouched() {

            }

            @Override
            public void onRightHandTouched() {

            }

            @Override
            public void onLeftFootTouched() {

            }

            @Override
            public void onRightFootTouched() {

            }
        };
        return this.naoMeraxes;
    }

}
