importScripts('https://www.gstatic.com/firebasejs/10.7.0/firebase-app-compat.js');
importScripts('https://www.gstatic.com/firebasejs/10.7.0/firebase-messaging-compat.js');

firebase.initializeApp({
  apiKey: "AIzaSyCl91EW0vWjt4fbwCVEQn5xLjPNlR-_5LA",
  authDomain: "oshaer-f2ae1.firebaseapp.com",
  projectId: "oshaer-f2ae1",
  storageBucket: "oshaer-f2ae1.firebasestorage.app",
  messagingSenderId: "64655933064",
  appId: "1:64655933064:web:6e86cb0640ff6a2c3da93d"
});

var messaging = firebase.messaging();

messaging.onBackgroundMessage(function(payload) {
  var title = payload.notification ? payload.notification.title : 'תזכורת';
  var body = payload.notification ? payload.notification.body : '';
  return self.registration.showNotification(title, {
    body: body,
    vibrate: [200, 100, 200],
    tag: 'reminder-' + Date.now(),
    renotify: true
  });
});

self.addEventListener('notificationclick', function(e) {
  e.notification.close();
  e.waitUntil(
    self.clients.matchAll({ type: 'window' }).then(function(list) {
      for (var i = 0; i < list.length; i++) {
        if ('focus' in list[i]) return list[i].focus();
      }
      return self.clients.openWindow('./');
    })
  );
});
