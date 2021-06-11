package edu.waynekeepo.je.dao.abs;

import edu.waynekeepo.je.annotations.JE;
import edu.waynekeepo.je.annotations.JET;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

@JE
public interface JEDAO<Type, ID> {

    Stream<Type> selectAll();

    Optional<Type> selectById(ID id);

    Stream<Type> selectByIDs(Collection<ID> ids);

    @JET
    boolean save(Type type);

    @JET
    boolean saveBatch(Collection<Type> entities);

    @JET
    boolean delete(ID id);

    @JET
    boolean deleteBatch(Collection<ID> id);

    @JET
    boolean update(ID id, Type type);

    @JET
    boolean updateBatch(Map<ID, Type> entities);

}
