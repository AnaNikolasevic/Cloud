Vagrant.configure("2") do |config|
  config.vm.box = "hashicorp/bionic64"
  config.vm.network "forwarded_port", guest: 8081, host: 8089
  config.vm.network "forwarded_port", guest: 82, host: 85
  config.vm.provision "file", source: "demo", destination: "demo"
  config.vm.provision "file", source: "nginx", destination: "nginx"
  config.vm.provision "file", source: "./docker-compose.yml", destination: "./docker-compose.yml"
  config.vm.provision :shell, path: "script.sh"
end
