package br.com.taiff.temperaturas.dto;

import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;

import br.com.taiff.temperaturas.model.Temperatura;

public class NovaTemperaturaRequest {

    @NotBlank
    private float t1;

    @NotBlank
    private float t2;
    
    @NotBlank
    private float t3;
    
    @NotBlank
    private float tAmbiente;
    
    @NotBlank
    private DateTimeFormat dateTime;

    public NovaTemperaturaRequest(float t1, float t2, float t3, float tAmbiente, DateTimeFormat dateTime) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.tAmbiente = tAmbiente;
        this.dateTime = (@NotBlank DateTimeFormat) dateTime;
    }

    public Temperatura toModel() {
        return new Temperatura(
                this.t1,
                this.t2,
                this.t3,
                this.tAmbiente,
                this.dateTime
        		);
    }

    /*
    @Override
    public String toString() {
        return "NovoProdutoRequest{" +
                "Temperatura 1 ='" + t1 + '\'' +
                "Temperatura 2 ='" + t2 + '\'' +
                "Temperatura 3 ='" + t3 + '\'' +
                "Temperatura Ambiente ='" + tAmbiente + '\'' +
                "Data do teste ='" + dataTime + '\'' +   
                '}';           
    }
    */
}

