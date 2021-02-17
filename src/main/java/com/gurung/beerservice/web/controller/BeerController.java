package com.gurung.beerservice.web.controller;

import com.gurung.beerservice.web.model.BeerDto;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Slf4j
@RequiredArgsConstructor
@Validated
@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    @GetMapping("/{beerId}")
    @ApiOperation(value = "Find the by id",
            notes="provide an id to look up specific contact from the ..",
            response = BeerDto.class
    )
    public ResponseEntity<BeerDto> getBeerById(@NotNull @PathVariable(name = "beerId") UUID beerId){
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@Valid @RequestBody BeerDto beerDto){
//        TODO: add
        val suraj_gurung = new String("suraj Gurung");
        log.debug("in handle post...");
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable(name = "beerId") UUID beerId,@RequestBody BeerDto beerDto){
//        TODO: add
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }


}
