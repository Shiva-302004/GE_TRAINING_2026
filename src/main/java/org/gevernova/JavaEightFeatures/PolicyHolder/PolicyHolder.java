package org.gevernova.JavaEightFeatures.PolicyHolder;

/**
 * Represents a policy holder in an insurance system.
 * Stores personal details and policy information.
 */
public class PolicyHolder {

    // Unique identifier for the policy holder
    int holderId;

    // Name of the policy holder
    String name;

    // Age of the policy holder
    int age;

    // Type of policy (e.g., Health, Life, Vehicle)
    String policyType;

    // Premium amount paid by the policy holder
    Double premiumAmount;

    /**
     * Constructor to initialize policy holder details.
     *
     * @param holderId      Unique holder ID
     * @param name          Holder name
     * @param age           Holder age
     * @param policyType    Policy type
     * @param premiumAmount Premium amount
     */
    public PolicyHolder(int holderId, String name, int age, String policyType, Double premiumAmount) {
        this.holderId = holderId;
        this.name = name;
        this.age = age;
        this.policyType = policyType;
        this.premiumAmount = premiumAmount;
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
     * @return Policy holder age
     */
    public int getAge() {
        return age;
    }

    /**
     * @return Policy type
     */
    public String getPolicyType() {
        return policyType;
    }

    /**
     * @return Premium amount
     */
    public Double getPremiumAmount() {
        return premiumAmount;
    }

    /**
     * Returns a readable string representation
     * of the PolicyHolder object.
     *
     * @return String describing the policy holder
     */
    @Override
    public String toString() {
        return "PolicyHolder{" +
                "holderId=" + holderId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", policyType='" + policyType + '\'' +
                ", premiumAmount=" + premiumAmount +
                '}';
    }
}
