package com.ct.user.client;

import com.ct.user.domain.Country;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author ct478
 * @date 2019/7/26 0026
 */
@Service
public class CountryClientFallback implements CountryClient {
    @Override
    public String add(String countryName) {
        return "error";
    }

    @Override
    public String delete(Long countryId) {
        return "error";
    }

    @Override
    public List<Country> query(Long countryId, String countryName) {
        return null;
    }

    @Override
    public String update(Long countryId, String countryName) {
        return "error";
    }

}
