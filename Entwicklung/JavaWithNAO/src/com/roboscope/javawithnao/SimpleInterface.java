package com.roboscope.javawithnao;

/**
 * Benutzbar für einfache Anwendungen ohne Callbacks.
 * Kann zu jedem der NAOs in einer von extern simplen Weise verbinden.
 */
public class SimpleInterface {

    private NaoJay naoJay = null;
    private NaoJoe naoJoe = null;
    private NaoJon naoJon = null;
    private NaoRobby naoRobby = null;

    public SimpleInterface() {
    }

    public NaoJay connectToJay() {
        this.naoJay = new NaoJay() {
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
        return this.naoJay;
    }

    public NaoJoe connectToJoe() {
        this.naoJoe = new NaoJoe() {
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
        return this.naoJoe;
    }

    public NaoJon connectToJon() {
        this.naoJon = new NaoJon() {
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
        return this.naoJon;
    }

    public NaoRobby connectToRobby() {
        this.naoRobby = new NaoRobby() {
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
        return this.naoRobby;
    }

}
