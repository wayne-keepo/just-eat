package edu.waynekeepo.je.dao.abs.repository;

import edu.waynekeepo.je.annotations.JE;
import edu.waynekeepo.je.annotations.JET;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

@JE
public interface JERepository<Type, ID> {

    Stream<Type> findAll();

    Optional<Type> findById(ID id);

    Stream<Type> findByIDs(Collection<ID> ids);

    @JET
    boolean store(Type type);

    @JET
    boolean storeAll(Collection<Type> entities);

    @JET
    boolean remove(ID id);

    @JET
    boolean removeAll(Collection<ID> ids);

    @JET
    boolean update(ID id, Type type);

    @JET
    boolean updateAll(Map<ID, Type> entities);
}