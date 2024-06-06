package br.com.junior.screenmatchs.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
