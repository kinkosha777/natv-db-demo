package kg.megacom.natvdbdemo.services;

import java.util.List;

public interface BaseCrudService <S,T>{
    S save( S s);

    S update( S s);

    List<S> findAll();

    S findById( T id);
}
