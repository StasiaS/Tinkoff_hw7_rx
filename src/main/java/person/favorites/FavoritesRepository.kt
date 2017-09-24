package person.favorites

import person.types.PersonWithAddress
import io.reactivex.Observable

internal class FavoritesRepository(private val personBackend: PersonBackend, private val favoritesDatabase: FavoritesDatabase) {


    fun loadFavorites(): Observable<List<PersonWithAddress>> {

        /**
         * Provide an observable that only emits a list of PersonWithAddress if they are marked as favorite ones.
         */

       throw NotImplementedError()
    }
}
