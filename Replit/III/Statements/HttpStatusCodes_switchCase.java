package III.Statements;

import java.util.Scanner;

public class HttpStatusCodes_switchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter status code:");
        int status = scan.nextInt();
        String codeMessage = "";

        switch (status) {
            case 200:
                codeMessage = "OK";
                break;
            case 201:
                codeMessage = "Created";
                break;
            case 202:
                codeMessage = "Accepted";
                break;
            case 301:
                codeMessage = "Moved Permanently";
                break;
            case 303:
                codeMessage = "See Other";
                break;
            case 304:
                codeMessage = "Not Modified";
                break;
            case 307:
                codeMessage = "Temporary Redirect";
                break;
            case 400:
                codeMessage = "Bad Request";
                break;
            case 401:
                codeMessage = "Unauthorized";
                break;
            case 403:
                codeMessage = "Forbidden";
                break;
            case 404:
                codeMessage = "Not Found";
                break;
            case 410:
                codeMessage = "Gone";
                break;
            case 500:
                codeMessage = "Internal Server Error";
                break;
            case 503:
                codeMessage = "Service Unavailable";
            default:
                codeMessage = "Invalid status code!";
        }
        System.out.println(codeMessage);
    }
}
/*
HTTP is the protocol that governs communications between servers and web clients (i.e. browsers).
Part of the protocol includes a status code returned by the server to tell the browser
the status of its most recent page request. Some of the codes and their meanings are listed below:

STATUS CODES

200, OK
201, Created
202, Accepted
301, Moved Permanently
303, See Other
304, Not Modified
307, Temporary Redirect
400, Bad Request
401, Unauthorized
403, Forbidden
404, Not Found
410, Gone
500, Internal Server Error
503, Service Unavailable
Given an int variable status write a switch statement to display the status code message.
If an invalid status code is entered display Invalid status code!

Example:

Display message: "Enter status code:"

input: 200

Display message: "OK"
 */
