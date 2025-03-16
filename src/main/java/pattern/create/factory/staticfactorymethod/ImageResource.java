package pattern.create.factory.staticfactorymethod;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Static factory method is good at caching heavy resource which is immutable.
 */
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class ImageResource {
  private final String imageId;
  @Getter
  private final byte[] image;
  // keep singleton at the same imageId
  // Recommend that using concurrentHashMap Caching for immutable objects since it prevent from race condition
  //  and guarantee singleton.
  private static final ConcurrentHashMap<String, ImageResource> CACHE = new ConcurrentHashMap<>();

  public static ImageResource getInstance(String imageId) {
    return CACHE.computeIfAbsent(imageId, (id -> new ImageResource(id, loadFromDisk(id))));
  }

  private static byte[] loadFromDisk(String imageId) {
    System.out.printf("Loading from disk image: " + imageId);
    // Heavy loading process..
    return new byte[1024];
  }
}
