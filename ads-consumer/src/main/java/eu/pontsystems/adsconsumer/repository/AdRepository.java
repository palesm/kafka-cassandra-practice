package eu.pontsystems.adsconsumer.repository;

import eu.pontsystems.adsconsumer.model.Ad;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

public interface AdRepository extends CassandraRepository<Ad, UUID> {
}
