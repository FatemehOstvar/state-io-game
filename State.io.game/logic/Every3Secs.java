package logic;

import static java.util.concurrent.TimeUnit.*;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
public class Every3Secs{
   private final ScheduledExecutorService scheduler =
      Executors.newScheduledThreadPool(1);

   public void update(State state) {
        Runnable beeper = new Runnable() {
               public void run() { 
                Update.update(state);
               }
           };
       final ScheduledFuture<?> beeperHandle =
           scheduler.scheduleAtFixedRate(beeper, 3, 3, SECONDS);
       scheduler.schedule(new Runnable() {
               public void run() { beeperHandle.cancel(true); }
           }, 60 * 60, SECONDS);
   }
}