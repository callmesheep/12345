package Sem4.TravelTour.service.FavoriteService;

import Sem4.TravelTour.entity.Favorite;
import Sem4.TravelTour.entity.Tours;
import Sem4.TravelTour.entity.User;
import Sem4.TravelTour.repository.FavoriteRepository.FavoriteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoriteServiceImpl implements FavoriteService{
    private final FavoriteRepository favoriteRepository;
    @Autowired
    public FavoriteServiceImpl(FavoriteRepository favoriteRepository) {
        this.favoriteRepository = favoriteRepository;
    }
    @Override
    public List<Favorite> findByUser(User user) {
        return favoriteRepository.findByUser(user);
    }
    @Override
    public Integer countByTours(Long id) {
        return favoriteRepository.countByTours(id);
    }
    @Override
    public Favorite findByTourAndUser(Tours tours, User user) {
        return favoriteRepository.findByToursAndUser(tours, user);
    }
    @Override
    public Favorite save(Favorite favorite) {
        return favoriteRepository.save(favorite);
    }
    @Override
    public boolean existsById(Long id) {
        return favoriteRepository.existsById(id);
    }
    @Override
    public void deleteById(Long id) {
        favoriteRepository.deleteById(id);
    }
}
