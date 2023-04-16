const { faker } = require('@faker-js/faker');

module.exports = {
  generateRandomData
}

function generateRandomData(userContext, events, done) {
  userContext.vars.fullName = faker.name.fullName();
  userContext.vars.age = faker.random.numeric(2);
  userContext.vars.salary = faker.random.numeric(5);
  return done()
}