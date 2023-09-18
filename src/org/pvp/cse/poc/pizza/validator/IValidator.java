package org.pvp.cse.poc.pizza.validator;

public interface IValidator<T> {

  void validate(T t) throws Exception;
}
