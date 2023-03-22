// in Scala 2:
// sealed trait HttpErrorForClient
// object HttpErrorForClient {
//   case object NotFound extends HttpErrorForClient
//   final case class BadRequest(messageForUser: String) extends HttpErrorForClient
//   case object Unauthorized extends HttpErrorForClient
//   case object InternalServerError extends HttpErrorForClient
// }

enum HttpErrorForClient:
  case NotFound
  case BadRequest(messageForUser: String)
  case Unauthorized
  case InternalServerError

def show(e: HttpErrorForClient) = e match
  case HttpErrorForClient.NotFound            => "NotFound"
  case HttpErrorForClient.BadRequest(msg)     => msg
  case HttpErrorForClient.Unauthorized        => "Unauthorized"
  case HttpErrorForClient.InternalServerError => "InternalServerError"
