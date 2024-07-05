package ru.voidlol.aboba.domain;

import java.util.Objects;

public class PropertyId {
    private Long meta;
    private Long child;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PropertyId that = (PropertyId) o;
        return Objects.equals(meta, that.meta) && Objects.equals(child, that.child);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meta, child);
    }
}
