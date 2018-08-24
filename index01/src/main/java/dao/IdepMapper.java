package dao;


import entity.Country;

import java.io.Serializable;

public interface IdepMapper {
    Country selectCountry(Serializable id);
}
