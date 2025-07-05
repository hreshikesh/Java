package com.xworkz.steamapi.repository;

import java.util.Collection;

public interface CountryRepository<T> {

    Collection<T> findBy();
}
