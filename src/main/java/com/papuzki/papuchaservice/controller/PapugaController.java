package com.papuzki.papuchaservice.controller;

import static javax.servlet.http.HttpServletResponse.SC_BAD_REQUEST;
import static org.apache.http.HttpStatus.SC_OK;

import com.papuzki.papuchaservice.model.Papuga;
import com.papuzki.papuchaservice.service.PapugaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import java.util.List;


@RestController
@RequestMapping(path = "/papuga")
public class PapugaController {

    @Autowired
    PapugaService papugaService;

    @GetMapping("/papugi")
    public List<Papuga> getAllPapuga() {
        return null;
    }

    @GetMapping("/papuga/{id}")
    public Papuga getPapuga(@PathVariable("id") Long id) {
        return null;
    }

    @ApiOperation("post papuga")
    @ApiResponses(value = {@ApiResponse(code = SC_OK, message = "ok"),
            @ApiResponse(code = SC_BAD_REQUEST, message = "An unexpected error occurred")})

    @PostMapping(value = "/add")
    @ApiResponse(code = 200,
            message = "added papuga",
            response = Papuga.class)
    public Papuga addPapuga(@RequestBody Papuga papuga) throws JsonProcessingException {
        papugaService.saveOrUpdate(papuga);
        return papuga;
    }

}
