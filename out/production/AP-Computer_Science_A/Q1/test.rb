require 'openai'

# Directly setting the API key in the script
api_key = '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'

# Initialize the OpenAI client with the API key
client = OpenAI::Client.new(access_token: api_key)

def chat_with_gpt4(client, prompt, model: "gpt-4", temperature: 0.7, max_tokens: 150)
  begin
    response = client.chat(
      parameters: {
        model: model,
        messages: [
          { role: "system", content: "You are a helpful assistant." },
          { role: "user", content: prompt }
        ],
        temperature: temperature,
        max_tokens: max_tokens
      }
    )

    # Extract and return the response text
    return response['choices'][0]['message']['content'].strip
  rescue => e
    return "An error occurred: #{e.message}"
  end
end

# Example usage
prompt = "Explain the concept of recursion in programming."
response = chat_with_gpt4(client, prompt)
puts "GPT-4 Response: #{response}"
