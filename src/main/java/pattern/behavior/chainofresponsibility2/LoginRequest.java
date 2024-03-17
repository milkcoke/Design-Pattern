package pattern.behavior.chainofresponsibility2;

/**
 * @param id Login ID
 * @param password Login Password
 */
public record LoginRequest(
  String id,
  String password
)   {
}
