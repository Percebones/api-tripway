package br.com.tripway.responses;

import br.com.tripway.model.ErrorModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ErrorResponse {
    public static ResponseEntity<Object> error400(String message) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorModel(message, "BAD_REQUEST"));
    }
    public static ResponseEntity<Object> error500(Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ErrorModel("Ocorreu um erro no servidor!",e, "INTERNAL_SERVER_ERROR"));
    }
}
