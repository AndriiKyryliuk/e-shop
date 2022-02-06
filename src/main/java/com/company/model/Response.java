package com.company.model;

import org.springframework.http.HttpStatus;

import java.util.Objects;

public class Response<T> {
    private T body;
    private HttpStatus status;

    public Response(T body, HttpStatus status) {
        this.body = body;
        this.status = status;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Response<?> response = (Response<?>) o;
        return Objects.equals(body, response.body) && status == response.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, status);
    }
}
