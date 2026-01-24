package org.gevernova.JavaEightFeatures.ClaimsAnalysis;

/**
 * Represents an insurance claim.
 * Stores claim details such as claim ID,
 * policy number, claim amount, claim date,
 * and claim status.
 */
public class Claim {

    // Unique identifier for the claim
    int claimId;

    // Policy number associated with the claim
    int policyNumber;

    // Amount claimed
    int getClaimAmount;

    // Date on which the claim was raised
    String claimDate;

    // Current status of the claim (e.g., Approved, Pending, Rejected)
    String status;

    /**
     * Constructor to initialize claim details.
     *
     * @param claimId        Unique claim ID
     * @param policyNumber  Policy number
     * @param getClaimAmount Claim amount
     * @param claimDate     Date of claim
     * @param status        Status of the claim
     */
    public Claim(int claimId, int policyNumber, int getClaimAmount, String claimDate, String status) {
        this.claimId = claimId;
        this.policyNumber = policyNumber;
        this.getClaimAmount = getClaimAmount;
        this.claimDate = claimDate;
        this.status = status;
    }

    /**
     * @return Claim ID
     */
    public int getClaimId() {
        return claimId;
    }

    /**
     * Sets the claim ID.
     *
     * @param claimId New claim ID
     */
    public void setClaimId(int claimId) {
        this.claimId = claimId;
    }

    /**
     * @return Policy number
     */
    public int getPolicyNumber() {
        return policyNumber;
    }

    /**
     * Sets the policy number.
     *
     * @param policyNumber New policy number
     */
    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    /**
     * @return Claim amount
     */
    public int getGetClaimAmount() {
        return getClaimAmount;
    }

    /**
     * Sets the claim amount.
     *
     * @param getClaimAmount New claim amount
     */
    public void setGetClaimAmount(int getClaimAmount) {
        this.getClaimAmount = getClaimAmount;
    }

    /**
     * @return Claim date
     */
    public String getClaimDate() {
        return claimDate;
    }

    /**
     * Sets the claim date.
     *
     * @param claimDate New claim date
     */
    public void setClaimDate(String claimDate) {
        this.claimDate = claimDate;
    }

    /**
     * @return Claim status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the claim status.
     *
     * @param status New claim status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Returns a readable string representation
     * of the Claim object.
     *
     * @return String describing the claim
     */
    @Override
    public String toString() {
        return "Claim{" +
                "claimId=" + claimId +
                ", policyNumber=" + policyNumber +
                ", getClaimAmount=" + getClaimAmount +
                ", claimDate='" + claimDate + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
