package com.sih.module2.model;

import java.util.List;

public class AIRiskResponse {
    private int riskScore;
    private String riskLevel;
    private List<String> factors;
    private String recommendation;

    // Empty constructor (required by Spring)
    public AIRiskResponse() {}

    // Constructor with all arguments
    public AIRiskResponse(int riskScore, String riskLevel, List<String> factors, String recommendation) {
        this.riskScore = riskScore;
        this.riskLevel = riskLevel;
        this.factors = factors;
        this.recommendation = recommendation;
    }

    // --- MANUAL GETTERS AND SETTERS ---
    public int getRiskScore() { return riskScore; }
    public void setRiskScore(int riskScore) { this.riskScore = riskScore; }
    public String getRiskLevel() { return riskLevel; }
    public void setRiskLevel(String riskLevel) { this.riskLevel = riskLevel; }
    public List<String> getFactors() { return factors; }
    public void setFactors(List<String> factors) { this.factors = factors; }
    public String getRecommendation() { return recommendation; }
    public void setRecommendation(String recommendation) { this.recommendation = recommendation; }
}