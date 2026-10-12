package com.persepolis.IA.dto;

/**
 * Data Transfer Object (DTO) representing a request to the Ollama API.
 * This class encapsulates the parameters required to generate a completion
 * or chat response from a specified model.
 */
public class OllamaRequest {

    /**
     * The name of the model to use (e.g., "llama2", "mistral").
     */
    private String model;

    /**
     * The input prompt to generate a response for.
     */
    private String prompt;

    /**
     * The maximum number of tokens to generate.
     * Note: Uses snake_case to match the JSON property expected by the API.
     */
    private int max_tokens;

    /**
     * Whether to stream the response or return it all at once.
     */
    private boolean stream;

    /**
     * Constructs a new OllamaRequest.
     *
     * @param model      The model name.
     * @param prompt     The input prompt.
     * @param max_tokens The maximum tokens to generate.
     * @param stream     True to enable streaming responses.
     */
    public OllamaRequest(String model, String prompt, int max_tokens, boolean stream) {
        this.model = model;
        this.prompt = prompt;
        this.max_tokens = max_tokens;
        this.stream = stream;
    }

    /**
     * Gets the model name.
     * @return The model name.
     */
    public String getModel() {
        return model;
    }

    /**
     * Gets the prompt.
     * @return The prompt text.
     */
    public String getPrompt() {
        return prompt;
    }

    /**
     * Gets the maximum number of tokens.
     * @return The max tokens limit.
     */
    public int getMax_tokens() {
        return max_tokens;
    }

    /**
     * Checks if streaming is enabled.
     * @return True if streaming is enabled, false otherwise.
     */
    public boolean isStream() {
        return stream;
    }
}
