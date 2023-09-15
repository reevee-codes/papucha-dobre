package com.papuzki.papuchaservice.controller;

import static javax.servlet.http.HttpServletResponse.SC_BAD_REQUEST;
import static org.apache.http.HttpStatus.SC_OK;

import java.util.Arrays;

import com.papuzki.papuchaservice.model.Papuga;
import com.papuzki.papuchaservice.service.BorbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@RestController
public class BorbEndpoint {

    @Autowired
    BorbService borbService;

    public BorbEndpoint(final BorbService borbService) {
        this.borbService = borbService;
    }

    @ApiOperation("post borb")

    @ApiResponses(value = {@ApiResponse(code = SC_OK, message = "ok"),
            @ApiResponse(code = SC_BAD_REQUEST, message = "An unexpected error occurred")})

    @PostMapping(value = "/papuga")
    @ApiResponse(code = 200,
            message = "",
            response = Papuga.class)
    public String postborb() throws JsonProcessingException {

        return "elo";
    }

}
