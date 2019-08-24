package micronaut.data.test

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Cat(
        @Id
        @GeneratedValue
        var id: Long,
        val name: String,
        @Column(name = "is_slept")
        val isslept: String
)