package controllers;

import annotation.Catch;
import play.mvc.Action;
import play.mvc.Http;
import play.mvc.Result;
import utils.ExceptionMailer;

import java.util.concurrent.CompletionStage;

public class CatchAction extends Action<Catch>{

  public CompletionStage<Result> call(Http.Request request) {
    try {
      return delegate.call(request);
    } catch(Throwable e) {
      if (configuration.send())
        ExceptionMailer.send(e);
      else
        e.printStackTrace();
      throw new RuntimeException(e);
    }
  }
}
