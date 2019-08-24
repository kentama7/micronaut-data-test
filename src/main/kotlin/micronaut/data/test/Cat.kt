package micronaut.data.test

import javax.persistence.*

@Entity
data class Cat(
        @javax.persistence.Id
        @javax.persistence.GeneratedValue
        var id: Long,
        val name: String,
        @Column(name = "is_slept")
        val isslept: String
)