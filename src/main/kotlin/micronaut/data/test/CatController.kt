package micronaut.data.test

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.HttpStatus

@Controller("/cat")
class CatController(
        private val catRepository: CatRepository
) {

    @Get("/")
    fun index(): HttpStatus {
        catRepository.save(Cat(0, "ねこ", "0", 0))
        println(catRepository.findAll())
        catRepository.save(Cat(1, "ねこ1", "1", 2))
        catRepository.save(Cat(1, "ねこ1", "1", 1))
        catRepository.updateByVersion(1, "neko", 0)
        catRepository.persist(Cat(1, "ねこ", "1", 1))
        return HttpStatus.OK
    }
}