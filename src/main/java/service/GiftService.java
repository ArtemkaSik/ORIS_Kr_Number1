package service;

import model.Gifts;
import repository.GiftRepository;

import java.util.List;

public class GiftService {
    private final GiftRepository repository = new GiftRepository();

    public List<Gifts> getAllGifts() {
        return repository.getAllGifts();
    }

    public Gifts getGiftById(Long id) {
        return repository.getGiftById(id);
    }
}
