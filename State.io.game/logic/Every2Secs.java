package logic;

import static java.util.concurrent.TimeUnit.*;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

public class Every2Secs{
   private final ScheduledExecutorService scheduler =
      Executors.newScheduledThreadPool(1);

   public void update(State state) {
        Runnable updateSoldiers = new Runnable() {
               public void run() { 
                Update.update(state);
               }
           };
       final ScheduledFuture<?> updateHandle =
           scheduler.scheduleAtFixedRate(updateSoldiers, 2, 2, SECONDS);
       scheduler.schedule(new Runnable() {
               public void run() { updateHandle.cancel(true); }
           }, 60 * 60, SECONDS);
   }
}