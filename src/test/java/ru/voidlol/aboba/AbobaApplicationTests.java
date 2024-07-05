package ru.voidlol.aboba;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import ru.voidlol.aboba.domain.Child;
import ru.voidlol.aboba.domain.Meta;
import ru.voidlol.aboba.domain.Parent;
import ru.voidlol.aboba.domain.Property;
import ru.voidlol.aboba.repository.ChildRepository;
import ru.voidlol.aboba.repository.MetaRepository;
import ru.voidlol.aboba.repository.ParentRepository;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class AbobaApplicationTests {

    @Autowired
    private ParentRepository parentRepository;

    @Autowired
    private MetaRepository metaRepository;
    @Autowired
    private ChildRepository childRepository;

    @Test
    @Transactional
    void contextLoads() {
        Parent parent = new Parent();
        Parent savedParent = parentRepository.save(parent);
        Meta meta = new Meta();
        Meta savedMeta = metaRepository.save(meta);

        Child child = createChild(savedParent, savedMeta);
        savedParent.getChildren().add(child);
        parentRepository.save(savedParent);
    }

    private Child createChild(Parent parent, Meta meta) {
        Child child = new Child();
        child.setParent(parent);
        child.getProperties().add(createProperty(child, meta));
        return child;
    }

    private Property createProperty(Child child, Meta meta) {
        Property property = new Property();
        property.setMeta(meta);
        property.setChild(child);
        property.setValue("test value");
        return property;
    }


}
