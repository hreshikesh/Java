package com.xworkz.streamapi.repository;

import java.util.Collection;
import java.util.Collections;

public interface CountryRepository<T> {
    Collection<T> countryFetch();
}
