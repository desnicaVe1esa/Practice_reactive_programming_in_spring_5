package ru.study.chapter_01.completion_stage;

import ru.study.chapter_01.commons.Input;
import ru.study.chapter_01.commons.Output;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class CompletionStageShoppingCardService implements ShoppingCardService {

    @Override
    public CompletionStage<Output> calculate(Input value) {

        return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return new Output();
        });
    }
}