package com.roboscope.javawithnao;

/**
 * Contains the different postures the robot can go to.
 * Should not be used by the students directly and is therefore hidden from view.
 */
enum RobotPosture {
    CROUCH("Crouch"),
    LYINGBACK("LyingBack"),
    LYINGBELLY("LyingBelly"),
    SIT("Sit"),
    SITONCHAIR("SitOnChair"),
    SITRELAX("SitRelax"),
    STAND("Stand"),
    STANDINIT("StandInit"),
    STANDZERO("StandZero");

    private String postureName;

    RobotPosture(String postureName) {
        this.postureName = postureName;
    }

    public String getPostureName() {
        return this.postureName;
    }
}
