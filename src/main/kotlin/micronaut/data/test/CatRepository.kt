package micronaut.data.test

import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.repository.CrudRepository

@JdbcRepository
interface CatRepository : CrudRepository<Cat, Long> {
    fun updateByVersion(@io.micronaut.data.annotation.Id id: Long?, name: String, version: Int)
    fun persist(entity: Cat): Cat
}