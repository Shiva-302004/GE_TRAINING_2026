package org.gevernova.JavaEightFeatures.PolicyHolder;

/**
 * Represents a policy holder along with
 * an associated risk score.
 * Used for risk assessment and categorization.
 */
public class RiskHolder {

    // Unique identifier of the policy holder
    int holderId;

    // Name of the policy holder
    String name;

    // Risk score calculated for the policy holder
    double score;

    /**
     * Constructor to initialize risk holder details.
     *
     * @param holderId Unique holder ID
     * @param name     Holder name
     * @param score    Risk score
     */
    public RiskHolder(int holderId, String name, double score) {
        this.holderId = holderId;
        this.name = name;
        this.score = score;
    }

    /**
     * @return Policy holder ID
     */
    public int getHolderId() {
        return holderId;
    }

    /**
     * @return Policy holder name
     */
    public String getName() {
        return name;
    }

    /**
     * @return Risk score of the holder
     */
    public double getScore() {
        return score;
    }

    /**
     * Returns a readable string representation
     * of the RiskHolder object.
     *
     * @return String describing the risk holder
     */
    @Override
    public String toString() {
        return "RiskHolder{" +
                "holderId=" + holderId +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
