package edu.waynekeepo.je.domain.base;


import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import static java.util.Objects.nonNull;

public abstract class DomainID implements Serializable {
    protected UUID id;

    public UUID id() {
        return this.id;
    }

    public UUID setId(UUID newId) {
        if (nonNull(newId))
            this.id = newId;
        return this.id;
    }

    public DomainID() {
        this.id = UUID.randomUUID();
    }

    public boolean isIdentity(DomainID other) {
        return Objects.equals(this.id, other.id());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DomainID domainID = (DomainID) o;
        return isIdentity(domainID);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}