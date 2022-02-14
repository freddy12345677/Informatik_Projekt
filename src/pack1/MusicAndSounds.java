package pack1;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class MusicAndSounds {

	public static synchronized void sounds(String track) {

		final String trackname = track;

		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					try {

						Clip clip = AudioSystem.getClip();
						AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File(trackname));
						clip.open(inputStream);

						if (Var.movementdetected == 1) {

							clip.loop(1);
							
							}


						Thread.sleep(clip.getMicrosecondLength() / 500);

					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}).start();

	}

}
