package com.aws.codestar.projecttemplates;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * POJO containing response object for API Gateway.
 */
public class GatewayResponse {

    private String body;
    private Map<String, String> headers;
    private int statusCode;
    private Date timestamp;

    public GatewayResponse(){
        //
    }

    /**
     * Instantiates a new Gateway response.
     *
     * @param body       the body
     * @param headers    the headers
     * @param statusCode the status code
     */
    public GatewayResponse(final String body, final Map<String, String> headers, final int statusCode) {
        timestamp = new Date();
        this.statusCode = statusCode;
        this.body = body;
        this.headers = Collections.unmodifiableMap(new HashMap<>(headers));
    }

    /**
     * Gets body.
     *
     * @return the body
     */
    public String getBody() {
        return body;
    }

    /**
     * Gets headers.
     *
     * @return the headers
     */
    public Map<String, String> getHeaders() {
        return headers;
    }

    /**
     * Gets status code.
     *
     * @return the status code
     */
    public int getStatusCode() {
        return statusCode;
    }

    /**
     * Gets timestamp.
     *
     * @return the timestamp
     */
    public Date getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "GatewayResponse{" +
                "body='" + body + '\'' +
                ", headers=" + headers +
                ", statusCode=" + statusCode +
                ", timestamp=" + timestamp +
                '}';
    }
}
