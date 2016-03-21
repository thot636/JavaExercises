import java.nio.file.*;
import static java.nio.file.StandardWatchEventKinds.*;
import static java.nio.file.LinkOption.*;
import java.nio.file.attribute.*;
import java.io.*;
import java.util.*;

class MySimple {
	public static void main(String [] args) throws IOException{
		new MySimple().run();
	}
	void run() throws IOException {
		WatchService watcher = FileSystems.getDefault().newWatchService();
		Path dir = Paths.get("test");
		WatchKey key = dir.register(watcher, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);
		for(;;){
			try {
                key = watcher.take();
            } catch (InterruptedException x) {
                return;
            }
			for (WatchEvent<?> event: key.pollEvents()) {
				WatchEvent.Kind kind = event.kind();
				
				// TBD - provide example of how OVERFLOW event is handled
				if (kind == OVERFLOW) {
					continue;
				}
				// Context for directory entry event is the file name of entry
				WatchEvent<Path> ev = cast(event);
				Path name = ev.context();
				Path child = dir.resolve(name);
				// print out event
				System.out.format("%s: %s\n", event.kind().name(), child);
				
				boolean valid = key.reset();
				
				/*if (!valid) {
					keys.remove(key);

					// all directories are inaccessible - good method to stop app
					if (keys.isEmpty()) {
						break;
					}
				}*/
				
			}
		}
	}
	@SuppressWarnings("unchecked")
    static <T> WatchEvent<T> cast(WatchEvent<?> event) {
        return (WatchEvent<T>)event;
    }

}