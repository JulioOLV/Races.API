package ddg.races.api.infra_database.dependency_injection;

import ddg.races.api.infra_database.collections.RaceCollection;
import ddg.races.api.infra_database.repositories.RaceRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class RaceRepositoryInjector implements IRaceRepositoryInjector {
    @Override
    public IDIRaceRepository insert() {
        return new DIRaceRepository(new RaceRepository() {
            @Override
            public <S extends RaceCollection> S save(S entity) {
                return null;
            }

            @Override
            public <S extends RaceCollection> List<S> saveAll(Iterable<S> entities) {
                return null;
            }

            @Override
            public Optional<RaceCollection> findById(String s) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(String s) {
                return false;
            }

            @Override
            public List<RaceCollection> findAll() {
                return null;
            }

            @Override
            public Iterable<RaceCollection> findAllById(Iterable<String> strings) {
                return null;
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public void deleteById(String s) {

            }

            @Override
            public void delete(RaceCollection entity) {

            }

            @Override
            public void deleteAllById(Iterable<? extends String> strings) {

            }

            @Override
            public void deleteAll(Iterable<? extends RaceCollection> entities) {

            }

            @Override
            public void deleteAll() {

            }

            @Override
            public List<RaceCollection> findAll(Sort sort) {
                return null;
            }

            @Override
            public Page<RaceCollection> findAll(Pageable pageable) {
                return null;
            }

            @Override
            public <S extends RaceCollection> List<S> insert(Iterable<S> entities) {
                return null;
            }

            @Override
            public <S extends RaceCollection> Optional<S> findOne(Example<S> example) {
                return Optional.empty();
            }

            @Override
            public <S extends RaceCollection> List<S> findAll(Example<S> example) {
                return null;
            }

            @Override
            public <S extends RaceCollection> List<S> findAll(Example<S> example, Sort sort) {
                return null;
            }

            @Override
            public <S extends RaceCollection> Page<S> findAll(Example<S> example, Pageable pageable) {
                return null;
            }

            @Override
            public <S extends RaceCollection> long count(Example<S> example) {
                return 0;
            }

            @Override
            public <S extends RaceCollection> boolean exists(Example<S> example) {
                return false;
            }

            @Override
            public <S extends RaceCollection, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
                return null;
            }
        });
    }
}
