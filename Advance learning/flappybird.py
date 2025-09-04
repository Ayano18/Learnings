# Flappy Bird Clone - Pygame
# Controls: Space or Up Arrow to jump, ESC to quit
import pygame
import random
import sys

# --- Settings ---
SCREEN_WIDTH = 400
SCREEN_HEIGHT = 600
FPS = 60

BIRD_COLOR = (255, 220, 80)
PIPE_COLOR = (60, 200, 90)
BG_COLOR = (135, 206, 235)
GROUND_COLOR = (220, 220, 220)
TEXT_COLOR = (0, 0, 0)

GRAVITY = 0.4
JUMP_STRENGTH = -8
PIPE_SPEED = 3
PIPE_GAP = 140
PIPE_INTERVAL = 1600  # milliseconds

class Bird:
    def __init__(self):
        self.reset()

    def reset(self):
        self.x = 100
        self.y = SCREEN_HEIGHT // 2
        self.vel_y = 0
        self.width = 34
        self.height = 24

    def update(self):
        self.vel_y += GRAVITY
        self.y += self.vel_y

    def jump(self):
        self.vel_y = JUMP_STRENGTH

    def get_rect(self):
        return pygame.Rect(self.x, self.y, self.width, self.height)

class Pipe:
    def __init__(self, x):
        self.x = x
        self.width = 60
        self.gap_y = random.randint(100, SCREEN_HEIGHT - 200)

    def update(self):
        self.x -= PIPE_SPEED

    def get_rects(self):
        top_rect = pygame.Rect(self.x, 0, self.width, self.gap_y)
        bottom_rect = pygame.Rect(self.x, self.gap_y + PIPE_GAP, self.width, SCREEN_HEIGHT)
        return top_rect, bottom_rect

def render_text(surface, text, size, center, bold=False):
    font = pygame.font.SysFont("consolas", size, bold=bold)
    surf = font.render(text, True, TEXT_COLOR)
    rect = surf.get_rect(center=center)
    surface.blit(surf, rect)

def main():
    pygame.init()
    screen = pygame.display.set_mode((SCREEN_WIDTH, SCREEN_HEIGHT))
    pygame.display.set_caption("Flappy Bird - Pygame")
    clock = pygame.time.Clock()

    bird = Bird()
    pipes = []
    score = 0
    running = True
    game_over = False

    # custom event for new pipes
    SPAWNPIPE = pygame.USEREVENT
    pygame.time.set_timer(SPAWNPIPE, PIPE_INTERVAL)

    while running:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                running = False
            elif event.type == pygame.KEYDOWN:
                if event.key == pygame.K_ESCAPE:
                    running = False
                if event.key in (pygame.K_SPACE, pygame.K_UP):
                    if not game_over:
                        bird.jump()
                    else:
                        # restart
                        bird.reset()
                        pipes.clear()
                        score = 0
                        game_over = False
            elif event.type == SPAWNPIPE and not game_over:
                pipes.append(Pipe(SCREEN_WIDTH))

        if not game_over:
            bird.update()
            for pipe in pipes:
                pipe.update()

            # collision detection
            bird_rect = bird.get_rect()
            if bird.y < 0 or bird.y + bird.height > SCREEN_HEIGHT - 40:
                game_over = True
            for pipe in pipes:
                for rect in pipe.get_rects():
                    if bird_rect.colliderect(rect):
                        game_over = True

            # scoring
            for pipe in pipes:
                if pipe.x + pipe.width < bird.x and not hasattr(pipe, "scored"):
                    score += 1
                    pipe.scored = True

            # remove off-screen pipes
            pipes = [p for p in pipes if p.x + p.width > 0]

        # --- Draw ---
        screen.fill(BG_COLOR)

        # pipes
        for pipe in pipes:
            top_rect, bottom_rect = pipe.get_rects()
            pygame.draw.rect(screen, PIPE_COLOR, top_rect)
            pygame.draw.rect(screen, PIPE_COLOR, bottom_rect)

        # ground
        pygame.draw.rect(screen, GROUND_COLOR, (0, SCREEN_HEIGHT - 40, SCREEN_WIDTH, 40))

        # bird
        pygame.draw.ellipse(screen, BIRD_COLOR, bird.get_rect())

        # score
        render_text(screen, f"Score: {score}", 28, (SCREEN_WIDTH // 2, 30))

        if game_over:
            render_text(screen, "GAME OVER", 48, (SCREEN_WIDTH // 2, SCREEN_HEIGHT // 2 - 40), bold=True)
            render_text(screen, "Press SPACE to Restart", 24, (SCREEN_WIDTH // 2, SCREEN_HEIGHT // 2 + 10))

        pygame.display.flip()
        clock.tick(FPS)

    pygame.quit()
    sys.exit()

if __name__ == "__main__":
    main()
