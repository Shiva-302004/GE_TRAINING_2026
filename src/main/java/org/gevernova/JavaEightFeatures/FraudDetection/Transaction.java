package org.gevernova.JavaEightFeatures.FraudDetection;

import java.time.LocalDate;

/**
 * Represents a financial transaction used
 * in fraud detection analysis.
 */
public class Transaction {

    // Unique identifier for the transaction
    int transactionId;

    // Policy number associated with the transaction
    String policyNumber;

    // Transaction amount
    int amount;

    // Date on which the transaction occurred
    LocalDate transactionDate;

    // Flag indicating whether the transaction is fraudulent
    boolean isFraudulent;

    /**
     * Constructor to initialize transaction details.
     *
     * @param transactionId   Unique transaction ID
     * @param policyNumber    Policy number
     * @param amount          Transaction amount
     * @param transactionDate Date of transaction
     * @param isFraudulent    Fraud indicator
     */
    public Transaction(int transactionId, String policyNumber, int amount,
                       LocalDate transactionDate, boolean isFraudulent) {
        this.transactionId = transactionId;
        this.policyNumber = policyNumber;
        this.amount = amount;
        this.transactionDate = transactionDate;
        this.isFraudulent = isFraudulent;
    }

    /**
     * @return Transaction ID
     */
    public int getTransactionId() {
        return transactionId;
    }

    /**
     * @return Policy number
     */
    public String getPolicyNumber() {
        return policyNumber;
    }

    /**
     * @return Transaction amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @return Transaction date
     */
    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    /**
     * @return true if the transaction is fraudulent
     */
    public boolean isFraudulent() {
        return isFraudulent;
    }

    /**
     * Returns a readable string representation
     * of the Transaction object.
     *
     * @return String describing the transaction
     */
    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + transactionId +
                ", policyNumber=" + policyNumber +
                ", amount=" + amount +
                ", transactionDate=" + transactionDate +
                ", isFraudulent=" + isFraudulent +
                '}';
    }
}
