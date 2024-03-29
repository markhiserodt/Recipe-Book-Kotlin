package recipebook.configuration

import org.ktorm.database.Database
import org.ktorm.jackson.KtormModule
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.sql.DataSource

@Configuration
class KtormConfiguration {
    @Autowired
    lateinit var dataSource: DataSource

    @Bean
    fun database(): Database {
        return Database.connectWithSpringSupport(dataSource)
    }

    @Bean
    fun ktormModule(): KtormModule {
        return KtormModule()
    }
}