package com.excercise;
 
import org.infinispan.client.hotrod.RemoteCache;
import org.infinispan.client.hotrod.RemoteCacheManager;
import org.infinispan.client.hotrod.configuration.ConfigurationBuilder;
import org.infinispan.client.hotrod.impl.ConfigurationProperties;
 
public class InfinispanRemote {
 
   public static void main(String[] args) {
      // Create a configuration for a locally-running server
      ConfigurationBuilder builder = new ConfigurationBuilder(); 
      builder.addServer().host("srvcache03.prod.hs18.lan").port(44222);
      // Connect to the server
      RemoteCacheManager cacheManager = new RemoteCacheManager(builder.build());
      // Obtain the remote cache
      RemoteCache<String, String> cache = cacheManager.getCache("ProductIdtoProductDataCache");
      /// Store a value
      //cache.put("key", "value");
      //Object data=cache.get("31786059");
      // Retrieve the value and print it out
      System.out.println("key = ", cache.get("31786059"));
      // Stop the cache manager and release all resources
      cacheManager.stop();
   }
 
}
 